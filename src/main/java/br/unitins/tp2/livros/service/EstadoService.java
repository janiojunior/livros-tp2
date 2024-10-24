package br.unitins.tp2.livros.service;

import java.util.List;

import br.unitins.tp2.livros.dto.EstadoDTO;
import br.unitins.tp2.livros.dto.EstadoResponseDTO;
import jakarta.validation.Valid;

public interface EstadoService {

    public EstadoResponseDTO create(@Valid EstadoDTO dto);
    public void update(Long id, EstadoDTO dto);
    public void delete(Long id);
    public EstadoResponseDTO findById(Long id);
    public List<EstadoResponseDTO> findAll(int page, int pageSize);
    public List<EstadoResponseDTO> findByNome(String nome);
    public List<EstadoResponseDTO> findByNome(int page, int pageSize, String nome);
    public List<EstadoResponseDTO> findBySigla(int page, int pageSize, String sigla);
    public long count();
    
}
