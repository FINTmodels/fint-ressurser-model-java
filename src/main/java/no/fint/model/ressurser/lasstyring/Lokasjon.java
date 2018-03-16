// Built from tag v0.99.0

package no.fint.model.ressurser.lasstyring;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Adresse;
import no.fint.model.ressurser.lasstyring.Koordinat;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Lokasjon implements FintMainObject {
    public enum Relasjonsnavn {
            LAS
    }

    @NonNull
    private List<Adresse> adresse;
    private String bygning;
    private String etasje;
    @NonNull
    private String navn;
    @NonNull
    private Koordinat posisjon;
    @NonNull
    private Identifikator systemId;
}
