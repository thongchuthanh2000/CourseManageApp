package com.gaf.coursemanageapp.service.impl;


import com.gaf.coursemanageapp.dto.ModuleDTO;
import com.gaf.coursemanageapp.entity.Module;
import com.gaf.coursemanageapp.repository.ModuleRepository;
import com.gaf.coursemanageapp.service.IModuleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.lang.reflect.Type;
import java.util.List;

@Service
@Transactional
public class ModuleServiceImpl implements IModuleService {
    @Autowired
    ModuleRepository moduleRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public List<ModuleDTO> findAll() {
        List<Module> modules = moduleRepository.findAll();
        List<ModuleDTO> moduleDTOS = mapper.map(modules, (Type) ModuleDTO.class);
        return moduleDTOS;
    }

    @Override
    public ModuleDTO findModuleByModuleID(ModuleDTO moduleDTO) {
        return null;
    }

    @Override
    public void save(ModuleDTO moduleDTO) {

    }

    @Override
    public void update(ModuleDTO moduleDTO) {
        Module oldModule=  moduleRepository.findModuleByModuleID(moduleDTO.getModuleID());


        oldModule.setModuleName(moduleDTO.getModuleName());

        moduleRepository.save(oldModule);
    }
}
