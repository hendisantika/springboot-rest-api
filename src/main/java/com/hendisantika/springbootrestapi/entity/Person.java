package com.hendisantika.springbootrestapi.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-rest-api
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-03-15
 * Time: 06:35
 */
@Data
@Entity
@Table(name = "people")
public class Person {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    @Column(name = "person_id")
    private Long id;

    private String name;
    private int age;

    @ManyToMany(cascade = CascadeType.ALL)
    @JsonBackReference
    @JoinTable(name = "people_parties",
            joinColumns = @JoinColumn(name = "person_id", referencedColumnName = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "party_id", referencedColumnName = "party_id"))
    private Set<Party> parties = new HashSet<Party>();

}
