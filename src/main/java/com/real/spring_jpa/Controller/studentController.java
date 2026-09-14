package com.real.spring_jpa.Controller;

import com.real.spring_jpa.model.Student;
import com.real.spring_jpa.repository.studentRepo;
import com.real.spring_jpa.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class studentController {
    private final StudentService studentService;
//    private final studentRepo studentRepo;

    @GetMapping("/")
    public String homepage(Model model){
        model.addAttribute("students",studentService.getStudents());
        return "home-page";
    }

}
