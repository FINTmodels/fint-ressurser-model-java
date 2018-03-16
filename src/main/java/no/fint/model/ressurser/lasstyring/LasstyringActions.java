// Built from tag v0.99.0

package no.fint.model.ressurser.lasstyring;

import java.util.Arrays;
import java.util.List;

public enum LasstyringActions {
	
	GET_LOKASJON,
	GET_ALL_LOKASJON,
	UPDATE_LOKASJON,
	GET_LAS,
	GET_ALL_LAS,
	UPDATE_LAS,
	GET_RETTIGHET,
	GET_ALL_RETTIGHET,
	UPDATE_RETTIGHET
	;


    /**
     * Gets a list of all enums as string
     *
     * @return A string list of all enums
     */
    public static List<String> getActions() {
        return Arrays.asList(
                Arrays.stream(LasstyringActions.class.getEnumConstants()).map(Enum::name).toArray(String[]::new)
        );
    }

}

