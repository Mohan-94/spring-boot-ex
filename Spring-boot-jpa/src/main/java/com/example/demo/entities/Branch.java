package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "branch")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@ApiModel(description="Details of Branch")
public class Branch implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "branch_no")
	@ApiModelProperty(notes="The unique id of the branch")
	private Long branchNo;
	@Column(name = "branch_name")
	@ApiModelProperty(notes="The branch name")
	private String branchName;
	@Column(name = "ifsc_code")
	@ApiModelProperty(notes="Ifsc code of the branch")
	private String ifscCode;
	@Column(name = "address_line1")
	@ApiModelProperty(notes="AddressLine1 details")
	private String addressLine1;
	@ApiModelProperty(notes="City of the branch")
	private String city;
	@ApiModelProperty(notes="State of the branch")
	private String state;
	@Column(name = "zip_code")
	@ApiModelProperty(notes="Zipcode of the branch")
	private Long zipCode;
	@ApiModelProperty(notes="Country of the branch")
	private String country;

}
