// Built from tag v0.99.0

package no.fint.model.ressurser.lasstyring;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Sikkerhetsprofil implements FintComplexDatatypeObject {
    @NonNull
    private String innloggingsniva;
    @NonNull
    private Integer makssesjonslevetid;
}
