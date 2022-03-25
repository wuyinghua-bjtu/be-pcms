package com.bepcms.pcms.model;

import com.bepcms.pcms.Entity.StudentAccount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Principal implements Serializable {
    private static final long serialVersionUID = 1L;

    private StudentAccount user;

}
