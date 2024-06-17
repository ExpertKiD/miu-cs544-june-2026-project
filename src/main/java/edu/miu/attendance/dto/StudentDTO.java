package edu.miu.attendance.dto;

import edu.miu.attendance.enumType.GenderType;
import lombok.Data;

import java.time.LocalDate;

@Data
public class StudentDTO {
    private String firstName;
    private String lastName;
    private GenderType genderType;
    private LocalDate birthDate;
    private String emailAddress;
    private String entry;
    private String alternateID;
    private String applicantId;
    private String studentId;
}
