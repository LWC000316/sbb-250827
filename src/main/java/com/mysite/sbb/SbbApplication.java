package com.mysite.sbb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbbApplication {

	public static void main(String[] args) {


//		// 답글로부터 질문을 찾아가는 방법
//		Answer a = new Answer();
//
//		Question question = new Question();
//		question.getContent();
//
//		a.getQuestion().getContent();
//
//		// 질문을 조회하는 방법

		//5번 질문 답글 조회 - v1
		//List<Answer> answers = answerRepository.findByQuestion(q5);  O
		//List<Answer> answers = answerRepository.findByQuestionId(5); O

		// 5번 질문 답글 조회 - v2 -> 이게 더 객체지향적
		// List<Answer> answers = q5.getAnswers();

		// OneToMany -> 기준 : 데이터의 양 / 생명주기 / 비즈니스 복잡도
		// 서비스 -> 1. 블로그 -> 글// 댓글 하나의 글에 댓글이 1000개 -> 데이터가 적고 복잡하지 않은 경우 OneToMany 도입 -> 편의성 확보
		//                          확장성이 높고 데이터가 많은 경우에는 사용하면 안 됌




		SpringApplication.run(SbbApplication.class, args);
	}

}
