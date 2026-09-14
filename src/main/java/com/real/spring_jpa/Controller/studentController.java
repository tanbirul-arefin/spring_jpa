package com.real.spring_jpa.Controller;

import com.real.spring_jpa.model.Student;
import com.real.spring_jpa.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class studentController {
    public StudentService studentService;

    public String homepage(Model model){
        model.addAttribute("students",studentService.getStudents());
        return "student";
    }

}
