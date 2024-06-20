package med.voll.api.domain.consulta;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    Boolean existsByMedicoIdAndDate(Long idMedico, LocalDateTime date);

    Boolean existsByMedicoIdAndDateAndMotivoCancelamentoIsNull(Long idMedico, LocalDateTime date);

    Boolean existsByPacienteIdAndDateBetween(Long idPaciente, LocalDateTime primeiroHorario, LocalDateTime ultimoHorario);

}
