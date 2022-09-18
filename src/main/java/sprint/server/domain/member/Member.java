package sprint.server.domain.member;

import lombok.Getter;
import sprint.server.domain.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
public class Member extends BaseEntity {

    @Id @GeneratedValue
    @NotNull
    @Column(name = "member_id")
    private Long id;
    @NotNull
    private String nickname;
    @NotNull
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @NotNull
    private String email;
    private LocalDate birthday;
    @NotNull
    private float height;
    @NotNull
    private float weight;
    private int mainGroupId;
    @NotNull
    private int tierId;
    private String picture;

    private LocalDate disableDay;

    protected Member() {
    }

    public Member(String nickname, Gender gender, String email, LocalDate birthday, float height, float weight, String picture) {
        this.nickname = nickname;
        this.gender = gender;
        this.email = email;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
        this.picture = picture;
        this.tierId = 0;
    }

    public void changeMemberInfo(String nickname, Gender gender, String email, LocalDate birthDay, float height, float weight, String picture){
        this.nickname = nickname;
        this.gender = gender;
        this.email = email;
        this.birthday = birthDay;
        this.height = height;
        this.weight = weight;
        this.picture = picture;
    }

    public void setDisableDay(LocalDate localDate){
        this.disableDay = localDate;
    }

    public void changeMainGroupId(int mainGroupId) {
        this.mainGroupId = mainGroupId;
    }
}