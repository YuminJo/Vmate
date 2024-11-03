<script>
	import { Alert } from 'flowbite-svelte';
	import { InfoCircleSolid } from 'flowbite-svelte-icons';
</script>

<h1>Welcome to SvelteKit</h1>

<p class="text-2xl font-bold">국가간에 우호관계의 인간은 인간이 폭정과 억압에</p>
<p>人類社会のすべての構成員の固有の尊厳と平等で譲ることのできない権利とを承認することは</p>

<p>Visit <a href="https://svelte.dev/docs/kit">svelte.dev/docs/kit</a> to read the documentation</p>

<Alert>
	<span class="font-medium">Default alert!</span>
	Change a few things up and try submitting again.
</Alert>

<Alert border>
	<InfoCircleSolid slot="icon" class="h-5 w-5" />
	<span class="font-medium">Default alert!</span>
	Change a few things up and try submitting again.
</Alert>
