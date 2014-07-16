package bootstrap.liftweb

import net.liftweb.http.{Html5Properties, LiftRules, Req}
import net.liftweb.sitemap.{Menu, SiteMap}

class Boot {
  def boot{
    // where to search snippet
    LiftRules.addToPackages("code")
    // build sitemap
    def sitemap(): SiteMap = SiteMap(
      Menu.i("Home") / "index"
    )

    // use html5 for rendering
    LiftRules.htmlProperties.default.set((r: Req) =>
      new Html5Properties(r.userAgent))
  }
}
