package com.myshop.ecommerce.config;


import com.myshop.ecommerce.entity.Product;
import com.myshop.ecommerce.entity.ProductCategory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {
    //
    //configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
    //od[] theUnsupportedAction={HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE};
	//
    //etExposureConfiguration()
    //.forDomainType(Product.class)
    //.withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedAction))
    //.withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedAction));
	//
    //etExposureConfiguration()
    //.forDomainType(ProductCategory.class)
    //.withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedAction))
    //.withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedAction));
    //}
}
