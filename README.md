# myosgi

A web application using Apache Karaf 3.0.2, CXF 2.7.18 and QLACK1.5.

[Display exported services](http://localhost:8181/cxf?_wadl)

After you have clean started karaf, execute the following commands:
`feature:repo-add cxf 2.7.18`
`feature:repo-add mvn:com.eurodyn.qlack2.test/qbe-consumer-karaf-features/1.0.0/xml/features`
`feature:install qlack-qbe-consumer`