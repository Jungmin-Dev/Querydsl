package study.querydsl.dto;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import lombok.Data;
import org.springframework.boot.SpringApplication;

@Data
public class MemberSearchCondition {
  //회원명, 팀명, 나이(ageGoe, ageLoe)
  private String username;
  private String teamName;
  private Integer ageGoe;
  private Integer ageLoe;
}
