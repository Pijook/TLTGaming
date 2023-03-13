package pl.pijok.TLTGaming.backend.user;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;

@Getter
@Builder
@Jacksonized
public class UserDto {

    private String name;

}
