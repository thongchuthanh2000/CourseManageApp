package com.gaf.coursemanageapp.service;


import com.gaf.coursemanageapp.dto.ModuleDTO;
import com.gaf.coursemanageapp.entity.Module;

import java.util.List;

public interface IModuleService {
    List<ModuleDTO> findAll();
    ModuleDTO findModuleByModuleID(ModuleDTO moduleDTO);
    void save(ModuleDTO moduleDTO);
    void update(ModuleDTO moduleDTO);
}
