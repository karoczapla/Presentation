package com.example.presentation;

import android.app.Activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListData extends Activity
{
    public static HashMap<String, List<String>> getData()
    {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();
        List<String> courses = new ArrayList<String>();
        courses.add("Mathematical Analysis 1 & 2");
        courses.add("Introduction to Computer Science and Comp. Programming");
        courses.add("Algebra and Analytic Geometry");
        courses.add("Logic and Formal Structures");
        courses.add("Physics");
        courses.add("Course of Programming Language - Java");
        courses.add("Legal Problems in Computer Science");
        courses.add("Discrete Mathematics");
        courses.add("Software Engineering");
        courses.add("Abstract Algebra and Coding");
        courses.add("Databases and Information Management");
        courses.add("System Architecture and Operating Systeme");
        courses.add("Probability and Statistic Methods");
        courses.add("Network Technologies");
        courses.add("Algorithms and Data Structures");
        courses.add("Mobile Applications");
        courses.add("Social Communication");
        courses.add("Formal Languages and Theory od Translation");
        courses.add("Scientific Computations");
        courses.add("Computer Graphics and Visualisation");
        courses.add("Cryptography");
        courses.add("Collegiate Programming");
        courses.add("Coding and Data Compression");
        courses.add("English Language C1.2");
        courses.add("Japanese Language A1");

        expandableListDetail.put("Courses completed:", courses);

        List<String> coursesToDo = new ArrayList<String>();
        coursesToDo.add("Functional programming and Category Theory");
        coursesToDo.add("Information Technology");
        coursesToDo.add("Theoretical Basics of Computer Science");
        coursesToDo.add("Embedded Systems");
        coursesToDo.add("Reliable IT Systems");
        coursesToDo.add("Concurrent Programming");

        expandableListDetail.put("Courses in progress:", coursesToDo);

        return expandableListDetail;
    }
}