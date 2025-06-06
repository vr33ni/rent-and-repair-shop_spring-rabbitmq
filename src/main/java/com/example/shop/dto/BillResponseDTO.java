package com.example.shop.dto;

import java.time.LocalDateTime;

import com.example.shop.enums.BillStatus;
 
public class BillResponseDTO {
    private Long id;
    private Long customerId;
    private String customerName;
    private Long rentalId;
    private Long repairId;
    private double rentalFee;
    private double repairFee;
    private double totalAmount;
    private BillStatus status;
    private LocalDateTime billCreatedAt;
    private LocalDateTime rentalDate;
    private LocalDateTime repairDate;
    private String description;

    public BillResponseDTO(Long id, Long customerId, String customerName, String description,
            Long rentalId, Long repairId,
            double rentalFee, double repairFee, double totalAmount,
            BillStatus status, LocalDateTime billCreatedAt,
            LocalDateTime rentalDate, LocalDateTime repairDate) {
        this.id = id;
        this.customerId = customerId;
        this.customerName = customerName;
        this.description = description;
        this.rentalId = rentalId;
        this.repairId = repairId;
        this.rentalFee = rentalFee;
        this.repairFee = repairFee;
        this.totalAmount = totalAmount;
        this.status = status;
        this.billCreatedAt = billCreatedAt;
        this.rentalDate = rentalDate;
        this.repairDate = repairDate;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getBillCreatedAt() {
        return billCreatedAt;
    }

    public void setBillCreatedAt(LocalDateTime billCreatedAt) {
        this.billCreatedAt = billCreatedAt;
    }

    public LocalDateTime getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(LocalDateTime rentalDate) {
        this.rentalDate = rentalDate;
    }

    public LocalDateTime getRepairDate() {
        return repairDate;
    }

    public void setRepairDate(LocalDateTime repairDate) {
        this.repairDate = repairDate;
    }

public BillStatus getStatus() {
        return status;
    }
    public void setStatus(BillStatus status) {
        this.status = status;
    }

    public Long getRentalId() {
        return rentalId;
    }

    public void setRentalId(Long rentalId) {
        this.rentalId = rentalId;
    }

    public Long getRepairId() {
        return repairId;
    }

    public void setRepairId(Long repairId) {
        this.repairId = repairId;
    }

    public double getRentalFee() {
        return rentalFee;
    }

    public void setRentalFee(double rentalFee) {
        this.rentalFee = rentalFee;
    }

    public double getRepairFee() {
        return repairFee;
    }

    public void setRepairFee(double repairFee) {
        this.repairFee = repairFee;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

}
