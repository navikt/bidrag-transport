package no.nav.bidrag.transport.sak

import io.swagger.v3.oas.annotations.media.Schema
import no.nav.bidrag.domain.bool.Ansatt
import no.nav.bidrag.domain.bool.Inhabilitet
import no.nav.bidrag.domain.bool.LevdeAdskilt
import no.nav.bidrag.domain.bool.Paragraf19
import no.nav.bidrag.domain.enums.Konvensjon
import no.nav.bidrag.domain.enums.Sakskategori
import no.nav.bidrag.domain.string.Enhet
import no.nav.bidrag.domain.string.FfuReferansenr
import no.nav.bidrag.domain.string.Landkode
import no.nav.bidrag.domain.tid.Konvensjonsdato

class OpprettSakRequest(
    @Schema(description = "Sakens eierfogd (enhetsnummeret som får tilgang til saken.")
    val eierfogd: Enhet,
    val kategori: Sakskategori = Sakskategori.N,
    val ansatt: Ansatt = Ansatt(false),
    val inhabilitet: Inhabilitet = Inhabilitet(false),
    val levdeAdskilt: LevdeAdskilt = LevdeAdskilt(false),
    val paragraf19: Paragraf19 = Paragraf19(false),
    @Schema(description = "Kovensjonskode tilsvarende kodene i T_KODE_KONVENSJON.")
    val konvensjon: Konvensjon? = null,
    val konvensjonsdato: Konvensjonsdato? = null,
    val ffuReferansenr: FfuReferansenr? = null,
    val land: Landkode? = null,
    val roller: Set<RolleDto> = setOf()
)
