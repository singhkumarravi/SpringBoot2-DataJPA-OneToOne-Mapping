package com.olive.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Table(name="Profile_tab")
@Entity
@AllArgsConstructor
@RequiredArgsConstructor
public class Profile {
@Id
@Column(name="pid")
private Integer profId;
@Column(name="pexp")
private Integer profExp;
@Column(name="psal")
private Double profSal;
}
