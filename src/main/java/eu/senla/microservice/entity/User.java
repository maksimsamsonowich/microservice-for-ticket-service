package eu.senla.microservice.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@Document
@Accessors(chain = true)
public class User {

    @Id
    private String username;

    @Field(value = "isBlocked")
    private Boolean isBlocked;

}
