package io.micronaut.jackson.bind;

import io.micronaut.core.bind.BeanPropertyBinder;
import io.micronaut.core.convert.ArgumentConversionContext;
import io.micronaut.core.convert.exceptions.ConversionErrorException;

import java.util.Map;
import java.util.Set;

/**
 * An {@link io.micronaut.core.bind.ArgumentBinder} capable of binding from an object from a map.
 *
 * @author Puneet Behl
 * @since 1.2.0
 */
public class IntrospectedBeanPropertyBinder implements BeanPropertyBinder {
    @Override
    public <T2> T2 bind(Class<T2> type, Set<? extends Map.Entry<? extends CharSequence, Object>> source) throws ConversionErrorException {
        return null;
    }

    @Override
    public <T2> T2 bind(T2 object, ArgumentConversionContext<T2> context, Set<? extends Map.Entry<? extends CharSequence, Object>> source) {
        return null;
    }

    @Override
    public <T2> T2 bind(T2 object, Set<? extends Map.Entry<? extends CharSequence, Object>> source) throws ConversionErrorException {
        return null;
    }

    @Override
    public <T2> T2 bind(Class<T2> type, Map<? extends CharSequence, Object> source) throws ConversionErrorException {
        return null;
    }

    @Override
    public <T2> T2 bind(T2 object, ArgumentConversionContext<T2> context, Map<? extends CharSequence, Object> source) {
        return null;
    }

    @Override
    public <T2> T2 bind(T2 object, Map<? extends CharSequence, Object> source) throws ConversionErrorException {
        return null;
    }

    @Override
    public <T2> T2 bind(T2 object, Object source) throws ConversionErrorException {
        return null;
    }

    @Override
    public <T2> boolean supports(T2 object) {
        return false;
    }

    @Override
    public BindingResult<Object> bind(ArgumentConversionContext<Object> context, Map<CharSequence, ? super Object> source) {
        return null;
    }

    @Override
    public int getOrder() {
        return -100;
    }
}
