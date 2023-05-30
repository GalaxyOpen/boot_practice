package com.example.demo_2.entity;

import javax.persistence.*;

@Entity
@Table(name = "nation_table" )
public class NationEntity {
    // @Entity를 받은 클래스가 정의되려면 primary key를 가진 컬럼이 꼭 있어야 함.
    @Id // PK 컬럼 지정할 때 씀
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment 적용
    private Long id;

    // column 추가
    @Column(length = 50, nullable = false, unique = true )
    private String nationName;

    @Column
    private int population;


}
