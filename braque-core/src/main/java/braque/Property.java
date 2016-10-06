package braque;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * <p>This holds the type of a given property, i.e. a Boolean, Integer, or another BraqueObject.</p>
 *
 * <pre>
 *     {@code @Property(String)}
 *      public interface CarModel {
 *      }
 * </pre>
 *
 * <p>Created by mikesolomon on 10/09/16.</p>
 */

@Retention(RetentionPolicy.RUNTIME)
public @interface Property {
    /**
     * @return The type of the property. Can be one of the following:
     * <ul>
     *     <li>{@code Boolean}</li>
     *     <li>{@code String}</li>
     *     <li>{@code Integer}</li>
     *     <li>{@code Double}</li>
     *     <li>{@code Float}</li>
     *     <li>{@code Long}</li>
     *     <li>an arbitrary {@code BraqueObject}</li>
     * </ul>
     */
    Class<?> value();
}
