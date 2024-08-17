package ib.slice.order.portal.api.commons;

import lombok.Builder;
@Builder(toBuilder = true)
public record GenericStringResponse(String status){}