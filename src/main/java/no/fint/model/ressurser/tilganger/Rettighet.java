// Built from tag v0.99.0

package no.fint.model.ressurser.tilganger;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.basisklasser.Begrep;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Rettighet extends Begrep implements FintMainObject {
    public enum Relasjonsnavn {
            IDENTITET
    }

    @NonNull
    private String beskrivelse;
    @NonNull
    private String navn;
}
