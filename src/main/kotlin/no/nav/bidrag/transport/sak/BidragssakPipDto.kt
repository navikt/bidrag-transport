package no.nav.bidrag.transport.sak

import io.swagger.v3.oas.annotations.media.Schema
import no.nav.bidrag.domain.bool.Paragraf19
import no.nav.bidrag.domain.string.Saksnummer

@Schema(
    description = "Metadata for pip tjeneste " +
        "(paragraf 19 på bidragssak, samt fnr for involverte roller"
)
data class BidragssakPipDto(
    @Schema(description = "Saksnummeret til bidragssaken")
    val saksnummer: Saksnummer,
    @Schema(description = "Om saken omhandler paragraf 19")
    val erParagraf19: Paragraf19 = Paragraf19(false),
    @Schema(description = "Fødselsnummer til personer innvolvert i bidragssaken")
    val roller: List<String> = emptyList()
)