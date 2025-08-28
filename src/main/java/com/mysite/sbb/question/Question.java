package com.mysite.sbb.question;

import com.mysite.sbb.answer.Answer;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200) // varchar(200)
    private String subject;

    @Column(columnDefinition = "TEXT") // TEXT
    private String content;

    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question", fetch=FetchType.LAZY , cascade = {CascadeType.REMOVE, CascadeType.PERSIST}) // 필수가 아닌 선택
    // answers 테이블에 이미 외래키가 있어서 다른 db를 만들어줄 필요가 없다고 말해줌
    private List<Answer> answers = new ArrayList<>();

    public void addAnswer(String content) {
        Answer answer = new Answer();
        answer.setContent(content);
        answer.setQuestion(this);
        answers.add(answer);
    }
}
