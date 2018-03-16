// Built from tag v0.99.0

package no.fint.model.ressurser.tilganger;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Identitet implements FintMainObject {
    public enum Relasjonsnavn {
            RETTIGHET,
            PERSONALRESSURS
    }

    @NonNull
    private Identifikator systemId;
}
