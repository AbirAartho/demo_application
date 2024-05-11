package com.crud.demo.controller;

import com.crud.demo.entity.Staff;
import com.crud.demo.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/staff")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class StaffController {

    @Autowired
    public StaffService staffService;

    @PostMapping("/add")
    public Staff addData(@RequestBody Staff staff) {
        return staffService.save(staff);
    }

    @GetMapping
    public List<Staff> getAll() {
        return staffService.getData();
    }

    @GetMapping("/{id}")
    public Staff getDataById(@PathVariable("id") Long id) {
        return staffService.getDataById(id);
    }

    @PutMapping("/update")
    public Staff update(@RequestBody Staff staff) {
        return staffService.save(staff);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        staffService.delete(id);
    }
}
