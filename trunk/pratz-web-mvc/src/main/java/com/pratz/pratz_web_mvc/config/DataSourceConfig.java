package com.pratz.pratz_web_mvc.config;import org.springframework.context.annotation.Configuration;import javax.sql.DataSource;@Configurationpublic interface DataSourceConfig {    DataSource dataSource();}