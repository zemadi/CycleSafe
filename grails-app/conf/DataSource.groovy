dataSource {
    pooled = true
    jmxExport = true
    driverClassName = "com.mysql.jdbc.Driver"
	dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
	username = "cmpe272t2sp14"
	password = "cmpe272t2sp14"
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
//    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
    singleSession = true // configure OSIV singleSession mode
}

// environment specific settings
environments {
    development {
         dataSource {
            dbCreate = "create"
            url = "jdbc:mysql://ec2-23-21-211-172.compute-1.amazonaws.com:3306/cmpe272t2sp14"
			username = "cmpe272t2sp14"
			password = "cmpe272t2sp14"
        }
    }
    test {
        dataSource {
            dbCreate = "create"
            url = "jdbc:mysql://ec2-23-21-211-172.compute-1.amazonaws.com:3306/cmpe272t2sp14"
			username = "cmpe272t2sp14"
			password = "cmpe272t2sp14"
        }
    }
    production {
        dataSource {
         dialect = 'org.hibernate.dialect.MySQL5InnoDBDialect'
         pooled = true
         dbCreate = 'create' // use 'update', 'validate', 'create' or 'create-drop'
		 
        
		 jndiName = 'java:comp/env/jdbc/cmpe272t2sp14'
      }
    }
}