dataSource {
    pooled = true
    driverClassName = "org.h2.Driver"
    username = "sa"
    password = ""
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
//    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
}

// environment specific settings
environments {
	development {
		dataSource {
		   dbCreate = "update"
		   driverClassName = "com.mysql.jdbc.Driver"
		   url = "jdbc:mysql://localhost/mediathrall"
		   username = "rincexwind"
		   password = "2bon2btitq"
		   pooled = true
		   properties {
			  maxActive = -1
			  minEvictableIdleTimeMillis=1800000
			  timeBetweenEvictionRunsMillis=1800000
			  numTestsPerEvictionRun=3
			  testOnBorrow=true
			  testWhileIdle=true
			  testOnReturn=true
			  validationQuery="SELECT 1"
		   }
	   }
   }
//    development {
//        dataSource {
//            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
//            url = "jdbc:h2:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
//        }
//    }
//	development {
//         dataSource {
//			dbCreate = "update"
//			driverClassName = "com.mysql.jdbc.Driver"
//			url = "jdbc:mysql://gortsema.com/mediathrall"
//			username = "rincexwind"
//			password = "2bon2btitq"
//			pooled = true
//			properties {
//			   maxActive = -1
//			   minEvictableIdleTimeMillis=1800000
//			   timeBetweenEvictionRunsMillis=1800000
//			   numTestsPerEvictionRun=3
//			   testOnBorrow=true
//			   testWhileIdle=true
//			   testOnReturn=true
//			   validationQuery="SELECT 1"
//			}
//		}
//	}
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
        }
    }
    production {
         dataSource {
			dbCreate = "update"
			driverClassName = "com.mysql.jdbc.Driver"
			url = "jdbc:mysql://localhost/mediathrall"
			username = "rincexwind"
			password = "2bon2btitq"
			pooled = true
			properties {
			   maxActive = -1
			   minEvictableIdleTimeMillis=1800000
			   timeBetweenEvictionRunsMillis=1800000
			   numTestsPerEvictionRun=3
			   testOnBorrow=true
			   testWhileIdle=true
			   testOnReturn=true
			   validationQuery="SELECT 1"
			}
		}
    }
}
