package no.nav.bidrag.transport.person

import com.fasterxml.jackson.annotation.JsonInclude
import io.swagger.v3.oas.annotations.media.Schema
import no.nav.bidrag.domain.enums.Adressetype
import no.nav.bidrag.domain.string.Adresselinje1
import no.nav.bidrag.domain.string.Adresselinje2
import no.nav.bidrag.domain.string.Adresselinje3
import no.nav.bidrag.domain.string.Bruksenhetsnummer
import no.nav.bidrag.domain.string.Landkode2
import no.nav.bidrag.domain.string.Landkode3
import no.nav.bidrag.domain.string.Postnummer
import no.nav.bidrag.domain.string.Poststed

@JsonInclude(JsonInclude.Include.NON_NULL)
data class PersonAdresseDto(
    @Schema(description = "Gyldige adressetyper: BOSTEDSADRESSE, KONTAKTADRESSE, eller OPPHOLDSADRESSE")
    val adressetype: Adressetype,
    @Schema(description = "Adresselinje 1")
    val adresselinje1: Adresselinje1? = null,
    @Schema(description = "Adresselinje 2")
    val adresselinje2: Adresselinje2? = null,
    @Schema(description = "Adresselinje 3")
    val adresselinje3: Adresselinje3? = null,
    @Schema(description = "Bruksenhetsnummer")
    val bruksenhetsnummer: Bruksenhetsnummer? = null,
    @Schema(description = "Postnummer, tilgjengelig hvis norsk adresse")
    val postnummer: Postnummer? = null,
    @Schema(description = "Poststed, tilgjengelig hvis norsk adresse")
    val poststed: Poststed? = null,
    @Schema(description = "To-bokstavers landkode ihht iso3166-1 alfa-2")
    val land: Landkode2,
    @Schema(description = "Trebokstavs landkode ihht iso3166-1 alfa-3")
    val land3: Landkode3
)