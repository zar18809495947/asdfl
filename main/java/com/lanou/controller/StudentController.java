package com.lanou.controller;

import com.lanou.bean.Student;
import com.lanou.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zar on 2017/11/2.
 */
@Controller
public class StudentController {
    @Resource
    private StudentService studentService;

    @ResponseBody
    @RequestMapping(value = "/allStudent")
    public List<Student> getAllStudent() {
        return studentService.allStudent();
    }
}
