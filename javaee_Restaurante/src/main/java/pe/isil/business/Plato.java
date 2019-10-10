package pe.isil.business;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Plato {
    private  Integer id;
    private  String nombre;
    private String categoria;
    private Double precio;
}
