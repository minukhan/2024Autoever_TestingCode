package com.hd.v1.item.entity;
import com.hd.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(callSuper = true)
@Table(name="item_db")
public class ItemEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;
    private Long price;

    @Builder
    public ItemEntity(Long id, String name, Long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


}