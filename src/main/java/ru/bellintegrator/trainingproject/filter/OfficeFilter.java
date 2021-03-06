package ru.bellintegrator.trainingproject.filter;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Фильтр Office
 */
public class OfficeFilter {

    /**
     * Уникальный идентификатор
     */
    @NotNull(groups = MarkerValidate.Update.class)
    @Pattern(regexp = "^[0-9]+$", groups = MarkerValidate.Update.class)
    private Integer id;

    /**
     * Уникальный идентификатор организации
     */
    @NotNull(groups = {MarkerValidate.List.class, MarkerValidate.Save.class})
    @Pattern(regexp = "^[0-9]+$", groups = {MarkerValidate.List.class,MarkerValidate.Save.class})
    private Integer orgId;

    /**
     * Название
     */
    @NotNull(groups = MarkerValidate.Update.class)
    @Size(min = 2, max = 50, groups = {MarkerValidate.List.class, MarkerValidate.Update.class, MarkerValidate.Save.class})
    private String name;

    /**
     * Адресс
     */
    @NotNull(groups = MarkerValidate.Update.class)
    @Size(min = 2, max = 50, groups = {MarkerValidate.Update.class, MarkerValidate.Save.class})
    private String address;

    /**
     * Телефон
     */
    @Pattern(regexp = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$",
            groups = {MarkerValidate.List.class, MarkerValidate.Update.class, MarkerValidate.Save.class})
    private String phone;

    /**
     * Действителен ли
     */
    @JsonProperty("isActive")
    private Boolean isActive;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("isActive")
    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
