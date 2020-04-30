package org.treblereel.gwt.jackson.tests.annotations.beans.company;

import java.util.Objects;

import javax.xml.bind.annotation.JacksonXmlProperty;
import javax.xml.bind.annotation.XmlRootElement;

import org.treblereel.gwt.jackson.api.annotation.XMLMapper;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 4/1/20
 */
@XMLMapper
@XmlRootElement(name = "employee")
public class Employee {

    @JacksonXmlProperty(localName = "employee_name", isAttribute = true)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) o;
        return Objects.equals(getName(), employee.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}