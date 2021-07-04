package com.example.jazs21611nbp.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "zloto")
public class NbpResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "id zlota", required = true, value = "id", example = "1")
    private Long id;
    @Enumerated(EnumType.STRING)
    @ApiModelProperty(notes = "nazwa kruszca", required = true, value = "id", example = "zloto")
    private Type nazwakruszca;
    @ApiModelProperty(notes = "date begin", required = true, value = "id", example = "2021-01-01")
    private LocalDate datebegin;
    @ApiModelProperty(notes = "date end", required = true, value = "id", example = "2021-01-02")
    private LocalDate dateend;
    @ApiModelProperty(notes = "average price", required = true, value = "id", example = "6.66")
    private float averagerpice;
    @ApiModelProperty(notes = "request date", required = true, value = "id", example = "2021-01-02")
    private LocalDate requestdate;
    @ApiModelProperty(notes = "request time", required = true, value = "id", example = "2021-01-01 00:00:00")
    private LocalTime requesttime;

    public NbpResponse(Long id, Type nazwakruszca, LocalDate datebegin, LocalDate dateend, float averagerpice, LocalDate requestdate, LocalTime requesttime) {
        this.id = id;
        this.nazwakruszca = nazwakruszca;
        this.datebegin = datebegin;
        this.dateend = dateend;
        this.averagerpice = averagerpice;
        this.requestdate = requestdate;
        this.requesttime = requesttime;
    }

    public NbpResponse() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Type getNazwakruszca() {
        return nazwakruszca;
    }

    public void setNazwakruszca(Type nazwakruszca) {
        this.nazwakruszca = nazwakruszca;
    }

    public LocalDate getDatebegin() {
        return datebegin;
    }

    public void setDatebegin(LocalDate datebegin) {
        this.datebegin = datebegin;
    }

    public LocalDate getDateend() {
        return dateend;
    }

    public void setDateend(LocalDate dateend) {
        this.dateend = dateend;
    }

    public float getAveragerpice() {
        return averagerpice;
    }

    public void setAveragerpice(float averagerpice) {
        this.averagerpice = averagerpice;
    }

    public LocalDate getRequestdate() {
        return requestdate;
    }

    public void setRequestdate(LocalDate requestdate) {
        this.requestdate = requestdate;
    }

    public LocalTime getRequesttime() {
        return requesttime;
    }

    public void setRequesttime(LocalTime requesttime) {
        this.requesttime = requesttime;
    }
}
