package br.com.udemy.carlosdv93.converter;
//Podia ser chamado de adapter tbm. pq é basicamente um adapter.

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

import java.util.ArrayList;
import java.util.List;

public class DozerConverter {

    private static Mapper mapper = DozerBeanMapperBuilder.buildDefault();

    /**
     * Faz a conversão de um objeto simples.
     * @param origin Qual o obj de origem
     * @param destination Qual o Obj que sera retornado
     * @return Objecto destino convertido
     */
    public static <O, D> D parseObject(O origin, Class<D> destination) {
        return mapper.map(origin, destination);
    }

    /**
     * Faz a conversão de um objeto simples do tipo Lista.
     * @param origin Qual o obj de origem
     * @param destination Qual o Obj que sera retornado
     * @return Objecto destino convertido
     */
    public static <O, D> List<D> parseListObjects(List<O> origin, Class<D> destination) {
        List<D> destinationObjects = new ArrayList<D>();
        for (Object o : origin) {
            destinationObjects.add(mapper.map(o, destination));
        }

        return destinationObjects;
    }
}
