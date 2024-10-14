package in.atos.jersey.health.insurance.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PLAN_MASTER") // admin
public class PlanMasterEntity 
{
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer planId;
		
		private String planName;
		private LocalDate planStartDate;
		private LocalDate planEndDate;
		private Integer planCategoryId;
		private Character activeSw;
		
		 @CreationTimestamp
		 private LocalDate createDate;
		
		 @UpdateTimestamp
		 private LocalDate updateDate; 
		 
		 private String createdBy;
		 
		 private String updatedBy;

		public Integer getPlanId() {
			return planId;
		}

		public void setPlanId(Integer planId) {
			this.planId = planId;
		}

		public String getPlanName() {
			return planName;
		}

		public void setPlanName(String planName) {
			this.planName = planName;
		}

		public LocalDate getPlanStartDate() {
			return planStartDate;
		}

		public void setPlanStartDate(LocalDate planStartDate) {
			this.planStartDate = planStartDate;
		}

		public LocalDate getPlanEndDate() {
			return planEndDate;
		}

		public void setPlanEndDate(LocalDate planEndDate) {
			this.planEndDate = planEndDate;
		}

		public Integer getPlanCategoryId() {
			return planCategoryId;
		}

		public void setPlanCategoryId(Integer planCategoryId) {
			this.planCategoryId = planCategoryId;
		}

		public Character getActiveSw() {
			return activeSw;
		}

		public void setActiveSw(Character activeSw) {
			this.activeSw = activeSw;
		}

		public LocalDate getCreateDate() {
			return createDate;
		}

		public void setCreateDate(LocalDate createDate) {
			this.createDate = createDate;
		}

		public LocalDate getUpdateDate() {
			return updateDate;
		}

		public void setUpdateDate(LocalDate updateDate) {
			this.updateDate = updateDate;
		}

		public String getCreatedBy() {
			return createdBy;
		}

		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}

		public String getUpdatedBy() {
			return updatedBy;
		}

		public void setUpdatedBy(String updatedBy) {
			this.updatedBy = updatedBy;
		}
		
		 
}
