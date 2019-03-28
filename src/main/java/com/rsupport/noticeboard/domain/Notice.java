package com.rsupport.noticeboard.domain;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "notice")
@Getter @Setter
@Builder
@NoArgsConstructor @AllArgsConstructor
public class Notice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(length = 20, nullable = false)
    private String writer;

    private LocalDateTime regDate;
    private LocalDateTime modDate;
}
