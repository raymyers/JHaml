# JHaml

A Java implementaion of [Haml](http://haml-lang.com/) (XHTML Abstraction Markup Language).

Haml features not currently supported:

* Interpolation. (Handled by Grails if rendering to GSP)

* Ugly mode for faster rendering speed.

* Interpreting lists as attribute values, e.g. {:id => [:a, :b]} yields id='a_b'

* Whitespace removal with '<' and '>'

* Multiline with |

* Escaping of expressions with '!=' and '&=' 

* Attribute Methods

* Object References: []

* 'encoding' option

Is is possible to use the related project Sass/SCSS from Java by using JRuby. Emil Hernvall is also working on a Java port of SCSS, called [SassyBarista](https://github.com/EmilHernvall/SassyBarista). The similar CSS framework LESS can be called from Java with Mozilla Rhino, as the [Asual](http://www.asual.com/lesscss/) project does.

## Using

    String html = new JHaml().parse("some haml");

There is a Grails plugin, Haml4Grails, that can be used to generate GSPs on the fly from Haml views. Integration with Spring MVC 3 and other Java frameworks is being explored. The biggest barrier is taglib support. Contact me (Ray) if interested.

## Authors

JHaml was created by [Ray Myers](http://cadrlife.com), with very special thanks to the implementers of the 
original Haml for Ruby, [Hampton Catlin](http://hamptoncatlin.com) and [Nathan Weizenbaum](http://nex-3.com).

This implementation is licensed under the GNU GPL version 3.0 OR Apache 2.0 at your option. The libraries it depends on are licensed as follows.

Google Guava: Apache 2.0

Apache Commons Lang: Apache 2.0

markdownj: BSD
