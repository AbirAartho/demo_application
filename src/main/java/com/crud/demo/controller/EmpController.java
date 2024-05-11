package com.crud.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
public class EmpController {

    //GET
    //GGE_TALL
    //POST
    //PUT
    //DELETE

    @GetMapping("/all")
    public String allAccess() { return "Public Content GET_ALL."; }

    @PostMapping("/all")
    public String createEmp() { return "post data"; }

    @PutMapping("/all")
    public String updateEmp() { return "Update Data"; }

    @DeleteMapping("/all")
    public String deleteEmp() { return "Delete Data"; }


}
