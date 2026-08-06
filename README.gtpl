<p align="left"><img src="https://raw.githubusercontent.com/blusewill/blusewill/main/github-metrics.svg" /></p>

### 👷 Check out what I'm currently working on
{{ range recentContributions 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}
### 🌱 My latest projects
{{ range recentRepos 5 }}
- [{{ .Name }}]({{ .URL }}) - {{ .Description }}
{{- end }}
### 🔨 My recent Pull Requests
{{ range recentPullRequests 5 }}
- [{{ .Title }}]({{ .URL }}) on [{{ .Repo.Name }}]({{ .Repo.URL }})
{{- end }}
### ⭐ Recent Stars
{{ range recentStars 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}
### 📰 Recent Blog Posts
{{ range rss "https://blusewill.top/zh-tw/index.xml" 5 }}
- [{{ .Title }}]({{ .URL }})
{{- end }}
### 📫 How to reach me:
  - Youtube   : <https://youtube.com/@blusewill>
  - Twitch    : <https://twitch.tv/blusewill>
  - Twitter   : <https://twitter.com/bluesewill>
  - Mastodon  : <https://mastodon.social/@bluesewill>
  - Website   : <https://blusewill.top/>

<p align="center"><a href="https://github.com/Platane/snk">
  <img align="center" src="https://raw.githubusercontent.com/blusewill/blusewill/output/github-contribution-grid-snake-dark.svg" />
</a></p>

