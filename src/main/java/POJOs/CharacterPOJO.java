package POJOs;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

public class CharacterPOJO {

    @JsonProperty
    private int char_id;

    @JsonProperty
    private String name;

    @JsonProperty
    private String birthday;

    @JsonProperty
    private ArrayList occupation;

    @JsonProperty
    private String img;

    @JsonProperty
    private String status;

    @JsonProperty
    private String nickname;

    @JsonProperty
    private ArrayList appearance;

    @JsonProperty
    private String portrayed;

    @JsonProperty
    private String category;

    @JsonProperty
    private ArrayList better_call_saul_appearance;

    public void showCharacterInformation(){

        System.out.println("\nCharacter name: "+name);
        System.out.println("Portrayed: "+portrayed);
        System.out.println("------------------------------\n");
    }

    public int getChar_id(){
        return char_id;
    }
}
