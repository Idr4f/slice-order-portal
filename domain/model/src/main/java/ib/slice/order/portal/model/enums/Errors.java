package ib.slice.order.portal.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.awt.*;

@AllArgsConstructor
@Getter
public enum Errors {

    FIND_ALL_ERROR("Usted no tiene los suficientes permisos para realizar esta acción"),
    FIND_BY_ID_ERROR("No se encontró la informacion solicitada"),
    DELETE_ERROR("Ocurrio un error al eliminar"),
    UPDATE_ERROR("Ocurrio un error al actualizar");
    private final String value;
}
