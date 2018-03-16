// Built from tag v0.99.0

package no.fint.model.ressurser.lasstyring;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Periode;
import no.fint.model.ressurser.lasstyring.Sikkerhetsprofil;
import java.util.Date;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Las implements FintMainObject {
    public enum Relasjonsnavn {
            LOKASJON
    }

    private Periode gyldighetsperiode;
    private Sikkerhetsprofil sikkerhetsprofil;
    @NonNull
    private Date sistsett;
    @NonNull
    private String status;
    @NonNull
    private Identifikator systemId;
}
