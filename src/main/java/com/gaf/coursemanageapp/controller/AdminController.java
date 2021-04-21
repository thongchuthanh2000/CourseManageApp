package com.gaf.coursemanageapp.controller;

import com.gaf.coursemanageapp.constant.SystemConstant;
import com.gaf.coursemanageapp.dto.AdminDto;
import com.gaf.coursemanageapp.entity.Admin;
import com.gaf.coursemanageapp.entity.Class;
import com.gaf.coursemanageapp.entity.Trainee;
import com.gaf.coursemanageapp.service.IAdminService;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping(value = "/admin")
@Tag(name = "admin")
public class AdminController {




    @Autowired
    private IAdminService adminService;

//    @Operation(description = "Thao tac Admin", responses = {
//            @ApiResponse(
//                    content = @Content(
//                            array = @ArraySchema(
//                                    schema = @Schema(implementation = Admin.class))), responseCode = "200") })
//    @ApiResponses(value = {
//            @ApiResponse(responseCode  = "200", description = "Thành công"),
//            @ApiResponse(responseCode  = "401", description = "Chưa xác thực"),
//            @ApiResponse(responseCode  = "403", description = "Truy cập bị cấm"),
//            @ApiResponse(responseCode  = "404", description = "Không tìm thấy")
//    })

    @PreAuthorize("hasRole(\"" + SystemConstant.ADMIN_ROLE + "\")")
    @PostMapping(value = "/loadProfile")
    public AdminDto getAdmin(){
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication()
                .getPrincipal();

        return  adminService.findByUserName(userDetails.getUsername());
    }


    @PutMapping(value = "/updateProfile")
    @PreAuthorize("hasRole(\"" + SystemConstant.ADMIN_ROLE + "\")")
    public boolean updateAdmin(
            @Valid
            @Parameter(description = "Update Admin", required = true, schema = @Schema(implementation = Admin.class))
            @RequestBody AdminDto adminDTO){

        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication()
                .getPrincipal();


        try{
            if (adminDTO.getUserName().equals(userDetails.getUsername())){
                adminService.update(adminDTO);
                return true;
            }
        }
        catch (Exception exception){

        }
        return  false;
    }
}
