
package com.NestDigital.nestvisitorapp.controller;

        import com.NestDigital.nestvisitorapp.model.EmployeeModel;
        import com.NestDigital.nestvisitorapp.model.dao.EmployeeDao;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;
        import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeDao dao;

    //    add employee
    @CrossOrigin(origins = "*")
    @PostMapping("/addemployee")
    public String addemployee(@RequestBody EmployeeModel employee){
        dao.save(employee);
        return  "employee added successfully";
    }
    //   delete employee
    @CrossOrigin(origins = "*")
    @DeleteMapping("/deleteemployee/{id}")
    public String deleteemployee(@PathVariable int id){
        dao.deleteById(id);
        return "deleted successfully";
    }

//    view all employees
    @CrossOrigin(origins = "*")
    @GetMapping("/viewallemployees")
    public List<EmployeeModel> viewallemployees(){

       return (List<EmployeeModel>) dao.findAll();
    }

    //    update employee
    @CrossOrigin(origins = "*")
    @PostMapping("/updateemployee")
    public String updateemployee(@RequestBody EmployeeModel employee){
        dao.updateemployee(employee.getDesignation(),employee.getEmploeecode(),employee.getName(),employee.getPassword(),employee.getPhoneno(),employee.getUsername(),employee.getId());
        return "updated successfully";
    }

//    Search employee
  @CrossOrigin(origins = "*")
  @GetMapping("/searchemployees")
  public List<EmployeeModel> searchemployees(@RequestBody EmployeeModel employee){

        return dao.search(employee.getId(),employee.getEmploeecode(),employee.getPhoneno(),employee.getPassword(),employee.getUsername(),employee.getDesignation(),employee.getName());
  }
// login
    @CrossOrigin(origins = "*")
    @GetMapping("/login")
    public String login(@RequestBody EmployeeModel employee){

        if (dao.login(employee.getUsername(),employee.getPassword()).size()>0){
            return "Succesfull login";
        }
        else{
            return  "invalid credentials";
        }
    }
}
